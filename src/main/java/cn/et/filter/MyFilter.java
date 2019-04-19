package cn.et.filter;

import com.netflix.zuul.ZuulFilter;

//@Component
public class MyFilter extends ZuulFilter {

    /**
     * 该函数需要返回一个字符串代表过滤器的类型
     * @return
     */
    @Override
    public String filterType() {
        return null;
    }

    /**
     * 通过int值来定义过滤器的执行顺序，数值越小优先级越高。
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 返回一个boolean值来判断该过滤器是否要执行。我们可以通过此方法来指定过滤器的有效范围。
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return false;
    }

    /**
     * 过滤器的具体逻辑。
     * @return
     */
    @Override
    public Object run() {
        return null;
    }
}
