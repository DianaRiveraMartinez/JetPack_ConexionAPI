package com.android.jp_test.modelo.servicios;

import com.android.jp_test.modelo.DatosModelo;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DatosAPI {

    @GET("data-core")
        Call<DatosModelo> obtenerResultados();

    }

