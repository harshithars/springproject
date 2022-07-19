import React from "react";
import { Link, Outlet } from "react-router-dom";

const Navbar = () => {
  return (
    <div>
      <header>
        <nav className="navbar navbar-expand-md navbar-dark bg-dark">
          <div>
            <a href="https://javaguides.net" className="navbar-brand">
            </a>

            <Link to="/">Home </Link> | 
            <Link to="/contact"> Contact</Link> |

            <Link to="/allcustomers"> All Customer</Link>


            <Outlet />
          </div>

        </nav>
      </header>
    </div>
  );
};

export default Navbar;