import { useState } from "react";
import customerService from "../service/CustomerService";
import { Link } from "react-router-dom";

function AddCustomer() {

    const [newCustomer, setNewCustomer] = useState(
        {
            "customerName": "",
            "password": "",
            "mobileNumber": "",
            "email": "",
            "regDate": ""
        }
    );

    const [msg, setMsg] = useState("");
    const [errMsg, setErrMsg] = useState("");


    const handleChange = (e) => {

        const name = e.target.name;
        const value = e.target.value;

        setNewCustomer((oldValue) => ({ ...oldValue, [name]: value }));

    }
    const handleSubmit = (e) => {
        e.preventDefault();
        console.log("Handle Submit");
        console.log(newCustomer);

        customerService.addCustomer(newCustomer)
            .then(
                (r) => {
                    console.log(r.data);
                    setMsg("Customer Added .");
                    setErrMsg("");

                }
            )
            .catch(
                (e) => { 
                    console.log(e);
                setErrMsg("Failed to add customer . " + e.message);
                setMsg("");
                }
            )
    }

    const customerElement = (
        <>
        <div className="container">
            <h3>Add Customer</h3>
            <hr/>
        {msg && <h3 className="alert alert-success">{msg}</h3>}
        {errMsg && <h3 className = "alert alert-danger">{errMsg}</h3>}

            <form onSubmit={handleSubmit}>
                <br/>
                <div className="form-group">
                <input type="text" name="customerName" className="form-control col-4" value={newCustomer.customerName} onChange={(event) => handleChange(event)} placeholder="customerName" required pattern="[A-Za-z0-9]{3,}" title="Name should be of min 3 chars, no special chars allowed."></input><br />
                </div>
                <div className="form-group">
                <input type="text" name="password"  className="form-control col-4" value={newCustomer.password} onChange={(event) => handleChange(event)} placeholder=" customerPassword"  required pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one  number and one uppercase and lowercase letter, and at least 8 or more characters"></input><br />
                </div>
                <div className="form-group">
                <input type="text" name="mobileNumber"  className="form-control col-4" value={newCustomer.mobileNumber} onChange={(event) => handleChange(event)} placeholder=" mobileNumber" required pattern="[0-9]{10}" title="Phone number must be  10 digits." ></input><br />
                </div>
                <div className="form-group">
                <input type="text" name="email"  className="form-control col-4" value={newCustomer.email} onChange={(event) => handleChange(event)} placeholder=" emailId" required></input><br />
                </div>
                <div className="form-group">
                <input type="date" name="regDate" value={newCustomer.regDate} onChange={(event) => handleChange(event)} placeholder=" regDate" required></input><br />
                </div>
                <div>
                <input type="submit" className="btn btn-primary"></input>
                </div>
            </form>
            <hr/>
            <Link to="/allcustomers">Back to List -</Link>
        </div>
        </>
    );

    return (
        customerElement

    );

}
export default AddCustomer;