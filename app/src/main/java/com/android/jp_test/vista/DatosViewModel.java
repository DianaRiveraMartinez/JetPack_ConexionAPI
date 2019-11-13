package com.android.jp_test.vista;

import com.android.jp_test.modelo.DatosModelo;
import com.android.jp_test.repositorio.DatosRepositorio;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DatosViewModel extends ViewModel {

    public static final MutableLiveData<DatosModelo> datosLiveData = new MutableLiveData<>();

    public LiveData<DatosModelo> obtenerDatos() {
        return datosLiveData;
    }

    void obtenerDatosRepositorio() {
        DatosRepositorio datosRepositorio = new DatosRepositorio();
       datosRepositorio.obtenerDatos();

       //mostrar datosRepositorio en la UI
    }

}
