import React from "react";
import { Link } from "react-router-dom";
import LogoSVG from "../assets/Logo.svg"

export default function Nav() {
    return (
        <header className="p-0 m-0">
            <nav className="navbar navbar-expand-sm navbar-toggleable-sm navbar-light border-bottom box-shadow mb-0">
                <Link className="navbar-brand" to='/'><img src={LogoSVG} className="logo" alt="Logo"/></Link>
                <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#conteudoNavbarSuportado" aria-controls="conteudoNavbarSuportado" aria-expanded="false" aria-label="Alterna navegação">
                    <span className="navbar-toggler-icon"></span>
                </button>

                <div className="collapse navbar-collapse" id="conteudoNavbarSuportado">
                    <ul className="navbar-nav mr-auto">
                        <li className="nav-item active">
                            <Link className="nav-link active" to='/'>Home<span /></Link>
                        </li>
                        <li className="nav-item">
                            <Link className="nav-link active" to='/Destinos'>Destinos</Link>
                        </li>
                        <li className="nav-item">
                            <Link className="nav-link active" to='/Promocoes'>Promoções</Link>
                        </li>
                        <li className="nav-item">
                            <Link className="nav-link active" to='/Contato'>Contato</Link>
                        </li>
                    </ul>
                </div>
            </nav>
        </header>
    );
}