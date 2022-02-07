import React, { Component } from "react";

import av1 from "../assets/aviaocoracaoesq.svg"
import av2 from "../assets/aviaocoracaodir.svg"

export default class Header extends Component {
    render() {
        return (
            <header className="header-pags p-0 m-0">
                <figure>
                    <img class="img-fluid" src={av1} alt="Avião" />
                </figure>
                <h2 class="text-center">{this.props.title}</h2>
                <figure>
                    <img class="img-fluid" src={av2} alt="Avião" />
                </figure>
                <hr class="p-0 m-0" />
            </header>
        )
    }
}
