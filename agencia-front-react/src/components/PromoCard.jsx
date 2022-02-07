import React, { Component } from "react";

export default class PromoCard extends Component {
    render() {
        return (
            <div className="box-promo">
                <div class="imgBox">
                    <img src={this.props.url} alt="promo" />
                </div>
                <div className="content">
                    <h3 className="intro m-1 p-1">{this.props.intro}</h3>
                    <p className="preco1 py-0">{this.props.preco1}</p>
                    <p className="preco2 py-0">{this.props.preco2}</p>
                    <div className="hover-card my-0">
                        <div className="promo-card m-0 p-0">
                            <h4 className="cidade my-0">{this.props.cidade}</h4>
                            <h6 className="estado my-0">{this.props.estado}</h6>

                            <p>{this.props.descricao}</p>
                        </div>
                    </div>
                </div>
            </div>
        )
    }
}