import Header from "../components/Header";
import contatoImg from "../assets/contato.svg"

export default function Contato() {
    return (
        <div className="p-0 m-0">
            <Header title="Contato" />
            <hr class="p-0 m-0" />
            <main class="main-pags">
                <div class="contato">
                    <figure>
                        <img src={contatoImg} alt="Contato" />
                    </figure>
                    <form id="contForm">
                        <label>Nome: </label><br />
                        <input class="input" type="text" /><br />
                        <label>E-mail: </label><br />
                        <input class="input" type="email" /><br />
                        <label>Mensagem:  </label><br />
                        <textarea name="msg" id="msg"></textarea><br />
                        <input id="btn-enviar" type="submit" value="Enviar" />
                    </form>
                </div>
            </main>
        </div>
    );
}