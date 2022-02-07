import { Link } from "react-router-dom";
import Footer from '../components/Footer'

export default function Home() {
    return (
        <>
        <div class="container-fluid mt-3">
            <main role="main" class="pb-3">
                <div class="jumbotron d-flex">
                    <div class="w-100 text-center">
                        <h1 class="display-4">Bem vindo Viajante</h1>
                        <p>Conheça nossos destinos mais procurados e planeje as férias dos seus sonhos. <br />Belíssimas paisagens naturais, e praias paradisíacas para uma viagem inesquecível!</p>
                        <hr />
                        <Link to='/Destinos' class="btn btn-secondary btn-sm">
                            Conhecer Destinos
                        </Link>
                    </div>
                </div>
                <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
                    <ol class="carousel-indicators">
                        <li data-target="#carouselExampleControls" data-slide-to="0" class="active"></li>
                        <li data-target="#carouselExampleControls" data-slide-to="1"></li>
                        <li data-target="#carouselExampleControls" data-slide-to="2"></li>
                        <li data-target="#carouselExampleControls" data-slide-to="3"></li>
                        <li data-target="#carouselExampleControls" data-slide-to="4"></li>
                    </ol>
                    <div class="carousel-inner">
                        <div class="carousel-item active" alt="Primeiro Slide">
                            <div class="carousel-caption d-none d-md-block">
                                <h5>Florianópolis - SC</h5>
                                <p>
                                    Conhecida como ilha da magia, possui uma integração perfeita entre natureza e cidade grande!
                                </p>
                            </div>
                        </div>
                        <div class="carousel-item" alt="Segundo Slide">
                            <div class="carousel-caption d-none d-md-block">
                                <h5>Rio de Janeiro - RJ</h5>
                                <p>A cidade maravilhosa representa a essência do povo Brasileiro! </p>
                            </div>
                        </div>
                        <div class="carousel-item" alt="Terceiro Slide">
                            <div class="carousel-caption d-none d-md-block">
                                <h5>Lençois Maranhenses - MA</h5>
                                <p>Dunas de areia branca e águas cristalinas integram a paisagem paradisíaca dos Lençois!</p>
                            </div>
                        </div>
                        <div class="carousel-item" alt="Quarto Slide">
                            <div class="carousel-caption d-none d-md-block">
                                <h5>Arraial do Cabo - RJ</h5>
                                <p>
                                    Conhecida como o caribe brasileiro, Arraial do cabo encanta por suas praias de água límpida!
                                </p>
                            </div>
                        </div>
                        <div class="carousel-item" alt="Quinto Slide">
                            <div class="carousel-caption d-none d-md-block">
                                <h5>Chapada dos Veadeiros - GO</h5>
                                <p>Um ótimo destino para aproveitar a integração com a natureza e belíssimas cachoeiras!</p>
                            </div>
                        </div>
                    </div>
                    <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
                        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                        <span class="sr-only">Anterior</span>
                    </a>
                    <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
                        <span class="carousel-control-next-icon" aria-hidden="true"></span>
                        <span class="sr-only">Próximo</span>
                    </a>
                </div>
            </main>
        </div>
        <Footer />
        </>
    );
}