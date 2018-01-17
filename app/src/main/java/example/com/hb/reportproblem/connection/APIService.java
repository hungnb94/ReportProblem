package example.com.hb.reportproblem.connection;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Streaming;

/**
 * Created by HP ProBook on 1/10/2018.
 */

public interface APIService {

    @Multipart
    @POST("/Report/public/problem")
    Call<ResponseBody> newProblem(@Part("boPhan") RequestBody boPhan,
                                  @Part("khuVucMay") RequestBody khuVucMay,
                                  @Part("may") RequestBody may,
                                  @Part("cumMay") RequestBody cumMay,
                                  @Part("chiTietMay") RequestBody chiTietMay,
                                  @Part("nguoiVietTag") RequestBody nguoiVietTag,
                                  @Part("dangNguyHiem") RequestBody dangNguyHiem,
                                  @Part("dangLoi") RequestBody dangLoi,
                                  @Part("dangNguyCo") RequestBody dangNguyCo,
                                  @Part("moTaChiTiet") RequestBody moTaChiTiet,
                                  @Part("ngayVietTag") RequestBody ngayVietTag,
                                  @Part("AMTag") RequestBody AMTag,
                                  @Part("HQCao") RequestBody HQCao,
                                  @Part("weekToDo") RequestBody weekToDo,
                                  @Part("giaiPhapTrietDe") RequestBody giaiPhapTrietDe,
                                  @Part("ngayXuLy") RequestBody ngayXuLy,
                                  @Part MultipartBody.Part file);

    @GET("/Report/public/hello")
    Call<ResponseBody> hello();

    @GET("/Report/public/download")
    @Streaming
    Call<ResponseBody> downloadFile();

    @Multipart
    @POST("/Report/public/problem")
    Call<ResponseBody> addProblem(@Part("boPhan") RequestBody boPhan,
                                  @Part("khuVucMay") RequestBody khuVucMay,
                                  @Part("may") RequestBody may,
                                  @Part("cumMay") RequestBody cumMay,
                                  @Part("chiTietMay") RequestBody chiTietMay,
                                  @Part("nguoiVietTag") RequestBody nguoiVietTag,
                                  @Part("dangNguyHiem") RequestBody dangNguyHiem,
                                  @Part("dangLoi") RequestBody dangLoi,
                                  @Part("dangNguyCo") RequestBody dangNguyCo,
                                  @Part("moTaChiTiet") RequestBody moTaChiTiet,
                                  @Part("ngayVietTag") RequestBody ngayVietTag,
                                  @Part("AMTag") RequestBody AMTag,
                                  @Part("HQCao") RequestBody HQCao,
                                  @Part("weekToDo") RequestBody weekToDo,
                                  @Part("giaiPhapTrietDe") RequestBody giaiPhapTrietDe,
                                  @Part("soNgayTonDong") RequestBody soNgayTonDong,
                                  @Part("ngayXuLy") RequestBody ngayXuLy,
                                  @Part("AMTeam") RequestBody AMTeam,
                                  @Part("type") RequestBody type,
                                  @Part("rank") RequestBody rank,
                                  @Part("done") RequestBody done,
                                  @Part("code") RequestBody code,
                                  @Part("safetyCode") RequestBody safetyCode,
                                  @Part("timeline") RequestBody timeline,
                                  @Part("WONumber") RequestBody WONumber,
                                  @Part MultipartBody.Part file);
}