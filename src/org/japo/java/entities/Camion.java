/*
 * Copyright 2020 Alejandro Alberca Gallardo - alejandro.alberca.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.entities;

/**
 *
 * @author Alejandro Alberca Gallardo - alejandro.alberca.alum@iescamp.es
 */
public class Camion extends Vehiculo{

    private static final long serialVersionUID = 1L;
    
    public static final int KM_REVISIONES = 5000;
    public static final int CONTADOR_MAX = 20;
    public static final int MARGEN_REVISION = 50;

    public Camion() {
    }
    
    public Camion (int contador){
    super();
    }
    
    

    @Override
    public int obtenerRevisiones() {
        return getContador() / KM_REVISIONES;
    }

    @Override
    public void mostrarInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
