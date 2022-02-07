import Header from "../components/Header";
import DestCard from "../components/DestCard";

export default function Destinos() {
    return (
        <div className="p-0 m-0">
            <Header title="Destinos" />
            <hr class="p-0 m-0" />
            <main class="main-pags">
                <div class="promo">
                    <DestCard url="https://media.discordapp.net/attachments/899633526411001876/939230081270812692/arraial-do-cabo.jpg?width=1191&height=670" descricao="Arraial do Cabo - RJ" preco="R$ 304,00" />
                    <DestCard url="https://media.discordapp.net/attachments/899633526411001876/939230081673494559/Barreirinhas-Lencois-Maranhenses.jpg" descricao="Barreirinhas - MA" preco="R$ 257,05" />
                    <DestCard url="https://media.discordapp.net/attachments/899633526411001876/939230082982092830/bonitoms.png" descricao="Bonito - MS" preco="R$ 179,80" />
                    <DestCard url="https://media.discordapp.net/attachments/899633526411001876/939230083418316830/brasilia.jpg" descricao="Brasília - DF" preco="R$ 218,00" />
                    <DestCard url="https://media.discordapp.net/attachments/899633526411001876/939230153219915877/buziosrj.jpg" descricao="Búzios - RJ" preco="R$ 299,90" />
                    <DestCard url="https://media.discordapp.net/attachments/899633526411001876/939230080868163645/altoparaiso-chapadaVead.jpg?width=1191&height=670" descricao="Chapada dos Veadeiros - GO" preco="R$ 197,05" />
                    <DestCard url="https://media.discordapp.net/attachments/899633526411001876/939230079731511356/curitiba.jpg?width=1191&height=670" descricao="Curitiba - PR" preco="R$ 304,00" />
                    <DestCard url="https://media.discordapp.net/attachments/899633526411001876/939230080113205289/Fernando-de-Noronha.jpg" descricao="Fernando de Noronha - PE" preco="R$ 402,00" />
                    <DestCard url="https://media.discordapp.net/attachments/899633526411001876/939230080444563476/floripa.jpg?width=1191&height=670" descricao="Florianópolis - SC" preco="R$ 345,00" />
                    <DestCard url="https://media.discordapp.net/attachments/899633526411001876/939230153974882325/foziguacu.jpg" descricao="Foz do Iguaçu - PR" preco="R$ 498,80" />
                    <DestCard url="https://media.discordapp.net/attachments/899633526411001876/939230154440446052/gramado.jpg" descricao="Gramado - RS" preco="R$ 320,00" />
                    <DestCard url="https://media.discordapp.net/attachments/899633526411001876/939230155119947807/Jericoacoara.jpg" descricao="Jericoacoara - CE" preco="R$ 228,05" />
                    <DestCard url="https://media.discordapp.net/attachments/899633526411001876/939230155396751381/manaus.jpg?width=1191&height=670" descricao="Manaus - AM" preco="R$ 199,00" />
                    <DestCard url="https://media.discordapp.net/attachments/899633526411001876/939230155723898920/maragogi.jpg" descricao="Maragogi - AL" preco="R$ 219,99" />
                    <DestCard url="https://media.discordapp.net/attachments/899633526411001876/939230213936664576/palmasTO.jpg" descricao="Palmas - TO" preco="R$ 185,00" />
                    <DestCard url="https://media.discordapp.net/attachments/899633526411001876/939230214272212992/penha-berocarrero.jpg?width=1189&height=669" descricao="Penha - SC" preco="R$ 302,70" />
                    <DestCard url="https://media.discordapp.net/attachments/899633526411001876/939230212841955379/Pocosdecaldasmg.jpg?width=1191&height=670" descricao="Poços de Caldas - MG" preco="R$ 177,00" />
                    <DestCard url="https://media.discordapp.net/attachments/899633526411001876/939230213567561800/Porto-Seguro.jpg" descricao="Porto Seguro - BA" preco="R$ 240,00" />
                    <DestCard url="https://media.discordapp.net/attachments/899633526411001876/939230152267812914/rio-de-janeiro.jpg?width=1191&height=670" descricao="Rio de Janeiro - RJ" preco="R$ 342,70" />
                    <DestCard url="https://media.discordapp.net/attachments/899633526411001876/939230152649482320/sao-paulo.jpg?width=1191&height=670" descricao="São Paulo - SP" preco="R$ 240,09" />
                </div>
            </main>
        </div>
    );
}