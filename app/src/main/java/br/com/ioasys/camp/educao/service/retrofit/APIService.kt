package br.com.ioasys.camp.educao.service.retrofit

import br.com.ioasys.camp.educao.service.models.request.LoginRequest
import br.com.ioasys.camp.educao.service.models.request.RegisterRequest
import br.com.ioasys.camp.educao.service.models.response.LoginResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface APIService {

    @POST("login")
//    suspend fun requestLogin(@Body loginRequest: LoginRequest): LoginResponse
    fun requestLogin(@Body loginRequest: LoginRequest): Call<LoginResponse>

    @POST("register")
    fun requestRegister(@Body registerRequest : RegisterRequest): RegisterRequest

//        @GET("courses?")
//        fun  queryCoures(@Query ("$input") input: String)

//(1) GET query de matérias
//POST de Cadastro
//(2) GET list_helpers
//aprender a fazer request em tempo real

}