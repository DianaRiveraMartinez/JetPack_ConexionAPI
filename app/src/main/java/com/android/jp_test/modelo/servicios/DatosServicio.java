package com.android.jp_test.modelo.servicios;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DatosServicio {

    private Retrofit retrofit = null;
    public DatosAPI obtenerAPI() {

        String BASE_URL = "https://api.datos.gob.mx/v1/";

        if (retrofit == null) {
            retrofit = new Retrofit
                    .Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit.create(DatosAPI.class);
    }
}