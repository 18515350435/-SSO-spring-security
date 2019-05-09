package com.zc.service.util;

import cn.apiclub.captcha.Captcha;
import cn.apiclub.captcha.backgrounds.GradiatedBackgroundProducer;
import cn.apiclub.captcha.noise.CurvedLineNoiseProducer;
import cn.apiclub.captcha.noise.NoiseProducer;
import cn.apiclub.captcha.text.producer.DefaultTextProducer;
import cn.apiclub.captcha.text.renderer.DefaultWordRenderer;
import cn.apiclub.captcha.text.renderer.WordRenderer;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 验证码工具类
 * Created by xun.suo on 2017/12/18.
 * 验证码工具类
 */
public class CaptchaUtil {

    /**
     * 获取图片验证码
     * @param _width 宽
     * @param _height 高
     * @param _noise 干扰线 1代表使用干扰线
     * @param _text 几位
     * @param base 使用哪些中文字符
     * @return 图片验证码对象
     */
    public static Captcha getCaptcha(Integer _width,Integer _height,Integer _noise,String _text,String base){
        Captcha.Builder builder = new Captcha.Builder(_width, _height);
        // 增加边框
        builder.addBorder();
        NoiseProducer nProd =  new CurvedLineNoiseProducer(Color.BLACK, 2);
        // 是否增加干扰线条
        if (_noise == 1){
        	builder.addNoise(nProd);
        }
        // ----------------自定义字体大小-----------
        // 自定义设置字体颜色和大小 最简单的效果 多种字体随机显示
        List<Font> fontList = new ArrayList<Font>();
        fontList.add(new Font("宋体", Font.HANGING_BASELINE, 55));// 可以设置斜体之类的
        fontList.add(new Font("Courier", Font.ITALIC, 55));
        fontList.add(new Font("宋体", Font.PLAIN, 55));

        // 加入多种颜色后会随机显示 字体空心
        List<Color> colorList = new ArrayList<Color>();
        colorList.add(Color.green);
        // colorList.add(Color.pink);
        //colorList.add(Color.gray);
//      colorList.add(Color.blue);
        DefaultWordRenderer cwr = new DefaultWordRenderer(colorList, fontList);
        //ColoredEdgesWordRenderer cwr= new ColoredEdgesWordRenderer(colorList,fontList);
        WordRenderer wr = cwr;
        // 增加文本，默认为5个随机字符.
        if (_text == null) {
            builder.addText();
        } else {
            String[] ts = _text.split(",");
            for (int i = 0; i < ts.length; i++) {
                String[] ts1 = ts[i].split(":");
                if ("chinese".equals(ts1[0])) {
                    char[] chinese = base.toCharArray();
                    builder.addText(
                            new DefaultTextProducer(Integer.parseInt(ts1[1]),
                                    chinese), wr);
                } else if ("number".equals(ts1[0])) {
                    char[] numberChar = new char[] { '0', '1', '2', '3', '4',
                            '5', '6', '7', '8', '9' };
                    builder.addText(
                            new DefaultTextProducer(Integer.parseInt(ts1[1]),
                                    numberChar), wr);
                } else if ("word".equals(ts1[0])) {
                    char[] numberChar = new char[] { 'A', 'B', 'C', 'D', 'E',
                            'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
                            'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y',
                            'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                            'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
                            't', 'u', 'v', 'w', 'x', 'y', 'z' };
                    builder.addText(
                            new DefaultTextProducer(Integer.parseInt(ts1[1]),
                                    numberChar), wr);
                } else {
                    builder.addText(
                            new DefaultTextProducer(Integer.parseInt(ts1[1]),
                                    null), wr);
                }
            }
        }// --------------添加背景-------------
        // 设置背景渐进效果 以及颜色 form为开始颜色，to为结束颜色
        GradiatedBackgroundProducer gbp = new GradiatedBackgroundProducer();
        gbp.setFromColor(Color.BLUE);
        gbp.setToColor(Color.WHITE);

        // 无渐进效果，只是填充背景颜色
//      FlatColorBackgroundProducer fbp=new FlatColorBackgroundProducer(Color.white);
        // 加入网纹--一般不会用
//       SquigglesBackgroundProducer sbp=new SquigglesBackgroundProducer();
        // 没发现有什么用,可能就是默认的
        // TransparentBackgroundProducer tbp = new
        // TransparentBackgroundProducer();

        builder.addBackground(gbp);

        // ---------装饰字体---------------
        // 字体边框齿轮效果 默认是3
//      builder.gimp(new BlockGimpyRenderer(1));
        // 波纹渲染 相当于加粗
//      builder.gimp(new RippleGimpyRenderer());
        // 加网--第一个参数是横线颜色，第二个参数是竖线颜色
//       builder.gimp(new FishEyeGimpyRenderer(Color.white,Color.black));
        // 加入阴影效果 默认3，75
        //builder.gimp(new DropShadowGimpyRenderer(5, 10));

        return builder.build();
    }
}
