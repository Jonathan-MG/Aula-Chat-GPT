import com.google.gson.Gson;
import okhttp3.*;

public class ChatGPTClient {
    public String criarPergunta(
        String OPENAI_API_KEY,
        String assunto,
        String tipo,
        String dificuldade,
        String perguntaExemplo
    ) throws Exception {
        String prompt = String.format("Elabore uma questão sobre %s, do tipo %s, de dificuldade %s", assunto, tipo, dificuldade);
        prompt += perguntaExemplo == null ? "" : String.format("Use a seguinte questão de exemplo: %s", perguntaExemplo);

        RequisicaoChatGPT requisicaoChatGPT = new RequisicaoChatGPT("text-davinci-003", prompt, 150);

        Gson gson = new Gson();
        String json = gson.toJson(requisicaoChatGPT);
        
        RequestBody requestBody = RequestBody.create(json, MediaType.parse("application/json"));
        OkHttpClient client = new OkHttpClient();

        return "";
    }
}
