import Header from "../components/Header";
import PromoCard from "../components/PromoCard";

export default function Promocoes() {
    return (
        <div className="p-0 m-0">
            <Header title="Promoções" />
            <main class="main-pags">
                <div class="promo">
                    <PromoCard url="https://media.discordapp.net/attachments/899633526411001876/939230081673494559/Barreirinhas-Lencois-Maranhenses.jpg" intro="Lençois Maranhenses" preco1="R$ 257.05" preco2="R$ 212.00" cidade="Barreirinhas" estado="Maranhão" descricao="A areia branca e fina marca o paradisíaco caminho percorrido pelos viajantes em meio ao Parque Nacional dos Lençóis Maranhenses." />

                    <PromoCard url="https://media.discordapp.net/attachments/899633526411001876/939230214272212992/penha-berocarrero.jpg?width=1189&height=669" intro="Beto Carrero World" preco1="R$ 302.70" preco2="R$ 245.05" cidade="Penha" estado="Santa Catarina" descricao="Beto Carrero World é o maior parque temático da América Latina! Mais de 100 incríveis atrações para toda a família!" />

                    <PromoCard url="https://media.discordapp.net/attachments/899633526411001876/939230080113205289/Fernando-de-Noronha.jpg" intro="Fernando de Noronha" preco1="R$ 402.00" preco2="R$ 349.99" cidade="Fernando de Noronha" estado="Pernambuco" descricao="Fernando de Noronha e sua atmosfera tornaram-se um sonho de consumo para muitas pessoas que gostam de contato com a natureza e um mergulho no mar." />

                    <PromoCard url="https://media.discordapp.net/attachments/899633526411001876/939230155119947807/Jericoacoara.jpg" intro="Jericoacoara" preco1="R$ 228.05" preco2="R$ 349.99" cidade="Jericoacoara" estado="Ceará" descricao="Entre dunas, mar, lagoas e mangues, a vila de Jeri é um refúgio diante da modernidade das grandes cidades e do agito diário." />

                    <PromoCard url="https://media.discordapp.net/attachments/899633526411001876/939230080444563476/floripa.jpg?width=1191&height=670" intro="Florianópolis" preco1="R$ 345.00" preco2="R$ 270.99" cidade="Florianópolis" estado="Santa Catarina" descricao="É uma capital que cresceu em meio à natureza, que oferece belas paisagens naturais, onde se pode curtir a agitação ou a tranquilidade!" />

                    <PromoCard url="https://media.discordapp.net/attachments/899633526411001876/939230154440446052/gramado.jpg" intro="Gramado" preco1="R$ 320.00" preco2="R$ 260.50" cidade="Gramado" estado="Rio Grande do Sul" descricao="Com vários parques, museus, rotas e restaurantes, Gramado não só um recanto de sossego, mas muito propício para pessoas de todas as idades" />

                    <PromoCard url="https://media.discordapp.net/attachments/899633526411001876/939230153974882325/foziguacu.jpg" intro="Foz do Iguaçu" preco1="R$ 498.80" preco2="R$ 416.99" cidade="Foz do Iguaçu" estado="Paraná" descricao="Foz do Iguaçu tem a honra de guardar um dos mais belos espetáculos da natureza na Terra, as Cataratas do Iguaçu." />

                    <PromoCard url="https://media.discordapp.net/attachments/899633526411001876/939230152267812914/rio-de-janeiro.jpg?width=1191&height=670" intro="Rio de Janeiro" preco1="R$ 342.70" preco2="R$ 299.90" cidade="Rio de Janeiro" estado="Rio de Janeiro" descricao="A cidade do Rio de Janeiro é a própria miscigenação da cultura do povo brasileiro; concentra em si tudo que uma cidade do mais alto padrão pode oferecer." />

                </div>
            </main>
        </div>
    );
}