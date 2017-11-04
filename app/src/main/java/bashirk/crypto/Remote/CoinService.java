package bashirk.crypto.Remote;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import bashirk.crypto.Model.Coin;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface CoinService {

    @GET("data/price")
    Call<Coin> calculateValue (@Query("fsym") String from, @Query("tsyms") String to);
}

