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

import java.io.Serializable;
import java.util.Random;
import org.japo.java.interfaces.IVehiculo;

/**
 *
 * @author Alejandro Alberca Gallardo - alejandro.alberca.alum@iescamp.es
 */
public abstract class Vehiculo implements Serializable, IVehiculo {

    private static final long serialVersionUID = 1L;

    private int contador;
    public static final int DEF_CONTADOR;
    public static final int AVISAR_REVISION = 50;

    static {
        final int MIN_CONTADOR = 0;
        final int MAX_CONTADOR = 20;
        final Random rnd = new Random();
        DEF_CONTADOR = rnd.nextInt(MAX_CONTADOR - MIN_CONTADOR + 1) + MIN_CONTADOR;
    }

    public Vehiculo() {
        contador = DEF_CONTADOR;
    }

    public Vehiculo(int contador) {
        if(validar(contador))
        {
            this.contador = contador;
        }else {
        this.contador = DEF_CONTADOR;}
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        if(validar(contador))
        {
            this.contador = contador;
        }
        this.contador = contador;
    }

    private boolean validar(int contador) {
        return contador >= DEF_CONTADOR;
    }

}
