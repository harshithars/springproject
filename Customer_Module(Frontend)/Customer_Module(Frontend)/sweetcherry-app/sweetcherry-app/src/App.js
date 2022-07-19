

import { BrowserRouter, Routes, Route, Link } from "react-router-dom";
import Layout from "./pages/Layout";
import Home from "./pages/Home";
import Contact from "./pages/Contact";

import DisplayAllCustomers from "./components/DisplayAllCustomers";
import AddCustomer from "./components/AddCustomer";

import Navbar from "./pages/Navbar";




function App() {
  return (
    <>

      <BrowserRouter>
      <Navbar/>

        <Routes>

          <Route exact path="/" element={<Layout />}>
            <Route index element={<Home />}/>
            <Route path="/contact" element={<Contact />} />
            <Route path="/allcustomers" element={<DisplayAllCustomers />} />
            <Route path="addcustomer" element={<AddCustomer />} />



          </Route>
        </Routes>
      </BrowserRouter>
    </>

  );
}

export default App;
