import React from "react";
import { Routes, Route } from "react-router-dom";

import Home from './pages/Home';
import Destinos from'./pages/Destinos'
import Promocoes from "./pages/Promocoes";
import Contato from './pages/Contato'

export default function MainRoutes(){
    return(
        <Routes>
            <Route path='/' element={<Home/>} />
            <Route path='/Destinos' element={<Destinos/>} />
            <Route path='/Promocoes' element={<Promocoes/>} />
            <Route path='/Contato' element={<Contato/>} />
        </Routes>
    )
}