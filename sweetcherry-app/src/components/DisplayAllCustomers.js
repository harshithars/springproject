import { useState, useEffect } from "react";
import { Link } from "react-router-dom";

import customerService from "../service/CustomerService";

function DisplayAllCustomers() {

    const [allCustomers, setAllCustomers] = useState(
        [{
            "customerId": "",
            "customerName": "",
            "email": "",
            "mobileNumber": "",
            "password": "",
            "regDate": "",
        }]
    );
    const [updateCustomer, setUpdateCutomer] = useState({
        "customerId": "",
        "customerName": "",
        "email": "",
        "mobileNumber": "",
        "password": "",
        "regDate": ""
    });
    const [isUpdate, setIsUpdate] = useState(false);

    const [msg, setMsg] = useState("");
    const [errMsg, setErrMsg] = useState("");


    useEffect(() => {
        //Runs only on the first render
        loadCustomerData();
    }, []);

    const loadCustomerData = () => {
        customerService.getAllCustomers()
            .then(
                (response) => {
                    console.log(response.data);
                    setAllCustomers(response.data);
                }
            )// call back for success response code
            .catch(
                (error) => {
                    console.log(error)
                }
            ) // call back for error response code

    }
    const handleDelete = (id) => {
        console.log("Delete:" + id);
        if (window.confirm("Are you sure to delete customer"))
            customerService.deleteCustomerById(id)
                .then(
                    (r) => {
                        console.log(r.data);
                        loadCustomerData();// after successful customer delte, load all customer data from back end 
                        setMsg("Customer deleted.");
                        setErrMsg("");
                    }
                )
                .catch(
                    (err) => {
                        console.log(err.message);
                        setErrMsg("Customerr could not be deleted.");
                        setMsg("");
                    }
                )
    };
    const handleUpdate = (updateCustomer) => {
        console.log("handleUpdate");
        console.log(updateCustomer);
        setIsUpdate(true);
        setUpdateCutomer(updateCustomer);// assign to updateCustome state

    }
    const handleUpdateSubmit = (e) => {
        e.preventDefault();
        console.log("Handle Update Submit");
        console.log(updateCustomer);

        customerService.updateCutomer(updateCustomer)
            .then(
                (r) => {
                    console.log(r.data);
                    setMsg("Customer Updated .");
                    setErrMsg("");
                    loadCustomerData();// after successful customer update, load all customer data from back end 
                    setIsUpdate(false);


                }
            )
            .catch(
                (e) => {
                    console.log(e);
                    setErrMsg("Failed to update customer . " + e.message);
                    setMsg("");
                }
            )
    }

    const handleChange = (e) => {

        const name = e.target.name;
        const value = e.target.value;

        setUpdateCutomer((oldValue) => ({ ...oldValue, [name]: value }));

    }

    const handleCancel = () => {
        setIsUpdate(false);
    }
    const updateCustomerElement = (
        <>
            <div className="container">
            <h3>Update Customer</h3>
            <hr/>

            <form onSubmit={handleUpdateSubmit}>
                <br/>
                <div className="form-group">
                <input type="text" name="customerName" className="form-control col-4" value={updateCustomer.customerName} onChange={(event) => handleChange(event)} placeholder="customerName" required pattern="[A-Za-z0-9]{3,}" title="Name should be of min 3 chars, no special chars allowed." ></input><br />
                </div>
                <div className="form-group">
                <input type="text" name="password"  className="form-control col-4" value={updateCustomer.password} onChange={(event) => handleChange(event)} placeholder=" customerPassword"  required pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one  number and one uppercase and lowercase letter, and at least 8 or more characters" ></input><br />
                </div>
                <div className="form-group">
                <input type="text" name="mobileNumber"  className="form-control col-4" value={updateCustomer.mobileNumber} onChange={(event) => handleChange(event)} placeholder=" mobileNumber" required pattern="[0-9]{10}" title="Phone number must be  10 digits." ></input><br />
                </div>
                <div className="form-group">
                <input type="text" name="email"  className="form-control col-4" value={updateCustomer.email} onChange={(event) => handleChange(event)} placeholder=" emailId" required ></input><br />
                </div>
                <div className="form-group">
                <input type="date" name="regDate" value={updateCustomer.regDate} onChange={(event) => handleChange(event)} placeholder=" regDate" disabled></input><br />
                </div>
                <div>
                <input type="submit" className="btn btn-primary"></input>
                <input type="button" className="btn btn-danger ml-3" onClick={handleCancel} value="Cancel"></input>
                </div>
            </form>
            <hr/>
        </div>

              
                
       

        </>
    );


    const allCustomersElement = (
        <>
            <div className="container">
            <h1 className="text-center"><u>SweetCherry Application</u></h1>
                <h3>List of Customer</h3>
                <hr />
                <div>
                    <Link to="/addcustomer" className="btn btn-primary mb-2">Add Customer</Link>

                    {msg && <h3 className="alert alert-success">{msg}</h3>}
                    {errMsg && <h3 className="alert alert-danger">{errMsg}</h3>}

                    {allCustomers.length == 0 && <h6>No customer registered to display...</h6>}
                    {allCustomers.length > 0 &&
                        <table className="table table-bordered table-striped">
                            <thead className="thead-dark">
                                <tr>
                                    <th> Name</th>
                                    <th> email</th>
                                    <th> Mobile</th>
                                    <th> Reg date</th>
                                    <th>Actions</th>
                                </tr>
                            </thead>
                            <tbody>
                                {
                                    allCustomers.map(
                                        (cust) => {
                                            return (
                                                <tr key={cust.customerId}>
                                                    <td>{cust.customerName}</td>
                                                    <td>{cust.email}</td>
                                                    <td>{cust.mobileNumber}</td>
                                                    <td>{cust.regDate}</td>
                                                    <td>
                                                        <input type="button" onClick={() => handleUpdate(cust)} className="btn btn-info" value="Update"></input>
                                                        <input type="button" onClick={() => handleDelete(cust.customerId)} className="btn btn-danger ml-4" value="delete"></input>
                                                    </td>
                                                </tr>);
                                        }
                                    )
                                }

                            </tbody>
                        </table>

                    }

                </div>
            </div>
        </>
    );


    return (
        isUpdate ? updateCustomerElement : allCustomersElement
    );


}
export default DisplayAllCustomers;