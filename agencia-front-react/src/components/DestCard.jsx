import React, { Component } from "react";

export default class DestCard extends Component {
    render() {
        return (
            <div className="box_destino card">
                <img src={this.props.url} alt="destino"/>
                <p className="descricao">{this.props.descricao}</p>
                <hr/>
                <p className="diarias">Diárias a partir de</p>
                <p className="preco">{this.props.preco}</p>
            </div>
        )
    }
}