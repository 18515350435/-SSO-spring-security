package com.zc.biz.dao.constants;

/**
 * @Description ConfigurationManager服务配置常量
 * @Author       Peihan.Zhang
 * @CreateTime  2018/5/2
 * @Version     0.0.1
 * @Email       zhangpeihan@jchzbj.com
 */
public class ConfigurationManager {
    private static PropertiesLoader propertiesLoader = new PropertiesLoader("config/bizapplication.properties");
    public static final String SECUREKEY = propertiesLoader.getProperty("SecureKey");
    public static final String WEBPAGES_VERSION = propertiesLoader.getProperty("webpages.Version");
    public static final String WEBPAGES_ENABLED = propertiesLoader.getProperty("webpages.Enabled");
    public static final String CLIENTVALIDATIONENABLED = propertiesLoader.getProperty("ClientValidationEnabled");
    public static final String UNOBTRUSIVEJAVASCRIPTENABLED = propertiesLoader.getProperty("UnobtrusiveJavaScriptEnabled");
    public static final String LFSAIRUPDATETIME = propertiesLoader.getProperty("LfsAirUpdateTime");
    public static final String LFSAIRGSKUPDATETIME = propertiesLoader.getProperty("LfsAirGskUpdateTime");
    public static final String LFSAIRDUSTUPDATETIME = propertiesLoader.getProperty("LfsAirDustUpdateTime");
    public static final String LFSAIRCOMPANYUPDATETIME = propertiesLoader.getProperty("LfsAirCompanyUpdateTime");
    public static final String LFPOLLUDAYSCONTROLCOUNT = propertiesLoader.getProperty("lfPolluDaysControlCount");
    public static final String XHHBUPDATETIME = propertiesLoader.getProperty("XhHbUpdateTime");
    public static final String FCUPDATETIME = propertiesLoader.getProperty("FcUpdateTime");
    public static final String HHUPDATETIME = propertiesLoader.getProperty("HhUpdateTime");
    public static final String HJXS = propertiesLoader.getProperty("HJXS");
    public static final String NBXS = propertiesLoader.getProperty("NBXS");
}
