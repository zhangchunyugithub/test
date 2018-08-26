package httpclient;

//import com.alibaba.fastjson.JSONObject;
//import com.springboot.util.RSAUtil;
//import com.yonyou.iuap.tenant.sdk.DataPermissionAndRuleCenter;
//import org.apache.http.HttpEntity;
//import org.apache.http.client.config.RequestConfig;
//import org.apache.http.client.methods.CloseableHttpResponse;
//import org.apache.http.client.methods.HttpPost;
//import org.apache.http.entity.StringEntity;
//import org.apache.http.impl.client.CloseableHttpClient;
//import org.apache.http.impl.client.HttpClientBuilder;
//import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

/**
 * @auther zhangchy
 * @create 2018/6/22
 */
public class HttpClient {
//
//    @Test
//    public void test2() throws Exception {

//        DataPermissionAndRuleCenter.queryDataPermAndRule();

//        RequestConfig config = RequestConfig.custom().setConnectTimeout(60000).setSocketTimeout(15000).build();
//        CloseableHttpClient httpClient = HttpClientBuilder.create().setDefaultRequestConfig(config).build();
//        String uri = "/aiplatform/oauth/v1/gettoken";
//
//        String domain = "http://172.20.14.154";
//        HttpPost post = new HttpPost();
//        post.setHeader("Content-Type", "application/json; charset=utf-8");
//        URI uril = new URI(domain + uri);
//        post.setURI(uril);
//        Map<String, String> map = new HashMap<>();
//        map.put("Content-Type", "application/json; charset=utf-8");
//
//        String text = "06da4854-17fe-41dd-b53c-cbe700927472;l9fbx0zz;diwork;"+System.currentTimeMillis();
//
//        JSONObject object = new JSONObject();
//        object.put("authtext", RSAUtil.encrypt(text,"D:/pub.key"));
//        StringEntity string = new StringEntity(object.toString());
//        post.setEntity(string);
//
//        CloseableHttpResponse execute = httpClient.execute(post);
//        HttpEntity entity = execute.getEntity();
//        String s = EntityUtils.toString(entity, "utf-8");
//        System.out.println("asdfasd:"+s);
//
//
//    }
}
