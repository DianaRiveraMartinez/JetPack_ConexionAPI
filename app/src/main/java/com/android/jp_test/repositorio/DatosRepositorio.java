package com.android.jp_test.repositorio;

import com.android.jp_test.modelo.DatosModelo;
import com.android.jp_test.modelo.servicios.DatosServicio;
import com.android.jp_test.vista.DatosViewModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.android.jp_test.vista.DatosViewModel.datosLiveData;

public class DatosRepositorio {

    public void obtenerDatos() {

        DatosServicio datosServicio = new DatosServicio();
        DatosViewModel datos = new DatosViewModel();
        datos.obtenerDatos();

            datosServicio.obtenerAPI().obtenerResultados().enqueue(new Callback<DatosModelo>() {

                @Override
                public void onResponse(Call<DatosModelo> call, Response<DatosModelo> response) {

                    datosLiveData.setValue(response.body());

                }

                @Override
                public void onFailure(Call<DatosModelo> call, Throwable t) {

                }
            });
    }
}
