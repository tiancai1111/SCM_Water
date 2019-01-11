package util;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016092300576864";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCkH1L6SxnR26xm1fBmJ4nBCelcsmCJhLPZkflrXPBmjdZnTEgGx/eGtx2gt6kjaYHXUGEDXfV4PTRdDF+fmLDdqh5ePJKYt0fS/hicKQXY28XqTO8ngxT1IQCezfXIG2ruRi8jjKcJ7i84B1XvzNuczqfCdkTfdZ8r4q8mOq6xMJy/Gy1V2kHxZPK5ifnpNU6SuFIcVA8a0o3veTc0t/21xd3ZGSbtDAM1lcQWhn2BJXzdub79K21q13dr3OirlIDtZyxdqPPMSsr2W2+R2FvAOLNcCAVBODvSbF++eCeAySQ4O2JYHEQkuIDhELCiO+/aGsPGJ1KO3hdm8ggGh/RnAgMBAAECggEAYTaYrN79LTwEU2lXmvrCctBPJPQXkH1FFpOLfJexYd2T6N3bMAEUUfx3FTKUggBFw2a+AAOQmacPNCpXHa6Q3Mueb01LvB+b8JNHun/mEbyj75OgePQA3u2sc2QluGDdJsP1ugXfD1fBKlvWAFOEpc4Wum3Zf88o+BKukmNiBFuHG5Mv92sJjg3bMROX4+1olhJJf55X7cA6DI+Q9qBxbXHq/Vvm23Uj24mFBRfVJEPs2WPFypWKst4NdB1NyrW2+iHVfcEHp+xqIXNZahPVSTm/dPyLTEofkrKAe9KZt/s+/pGOGTMVAsgj+yhXVhtCUqMHO2qKe114YsWiC0V5EQKBgQDTZGPJO3gT5g34TlQjucy51xT9StEyNsYvhEX0aOFvPMDwHXU0vRemegwEQ3XgrLVKdfKVmItqEbN66/xtV+SIxo7QS8tZHCqTtChy3XY7wrw8qjdpE9Xo3OLU2DpkBki10nr3uMHCEihl74J6YsJpJWmlavCMJUtwg4hNj++uaQKBgQDGwV/PShpRR3sVJchZ/X2/Ij70wq/0MHXObLg08II0CJwzqVPfJWIb+zNvIKjB8bfk0QniwTnLEPaPUrEIjyD1Y7qPhkCRfspVJY4gfBUn3SbwYBR+ft9DAElBk8fM6xY3jp2LviLu33dS6uEp2oF7sX9qRYuVa8GKu+JaeKfSTwKBgH+fJhdBTfdFdr2oHGgNLiosTcG1v6J/KxtY0hsCjsdneFv+jNowJu0c1dBlIe9olXLEzpW+KLz6vs7BVf51h8WDioj6mWPM+2983saqKU1e/eHqKdXIYeZaJJ+3g1kL6i3LSu3vnxqZd8ZC2RUmNpTgP23cqCkUAv2Ei2+4LE2xAoGBALx9Vyd2106Nw6RimIb/Z+mDyMDGgafK7W4+nNNX46MFJ123D9tn0ItIx5Z0GpcTbZqKxB1PskdqZum1Oj8rvc36Lks+vq082RW27/rOsiGEEhGUjNsJ5yHbe529UJZ9vCwkDDUitG5lbvwr1C2lE3cC9hsKqT2jW4D+fcPe+QjxAoGAE9PB8gCFfvfnLktFWU8MIfJ1IMCaCKqsByu5WGV3f3L2yUlcgEeiVGz8grjwtVFlajsg+b2kIYY3+iEug+reosYdX2GQ6SBHyeCuajWe4WRG6UdlRrJBfQBkvsyk6rhQXl8jcR64sguFHVATwGYze72B13wlpn7jx6FqRwp/Izk=";

    		
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key ="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEApB9S+ksZ0dusZtXwZieJwQnpXLJgiYSz2ZH5a1zwZo3WZ0xIBsf3hrcdoLepI2mB11BhA131eD00XQxfn5iw3aoeXjySmLdH0v4YnCkF2NvF6kzvJ4MU9SEAns31yBtq7kYvI4ynCe4vOAdV78zbnM6nwnZE33WfK+KvJjqusTCcvxstVdpB8WTyuYn56TVOkrhSHFQPGtKN73k3NLf9tcXd2Rkm7QwDNZXEFoZ9gSV83bm+/Sttatd3a9zoq5SA7WcsXajzzErK9ltvkdhbwDizXAgFQTg70mxfvngngMkkODtiWBxEJLiA4RCwojvv2hrDxidSjt4XZvIIBof0ZwIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
/*	public static String notify_url = "http://localhost/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";*/
    public static String notify_url = "http://localhost:8080/notify_url";
	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	/*public static String return_url = "http://localhost/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";*/
    public static String return_url = "http://localhost:8080/return_url";
	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

