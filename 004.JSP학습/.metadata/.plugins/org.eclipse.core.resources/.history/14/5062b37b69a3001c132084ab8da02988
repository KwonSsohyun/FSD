package com.filter;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class NullParameterRequestWrapper extends HttpServletRequestWrapper {

    private Map<String, String[]> parameterMap = null;

    public NullParameterRequestWrapper(HttpServletRequest request) {
        super(request);
        //request = > NullParameterFilter클래스에서 보낸 리퀘스트 객체임
        //getParameterMap() : request보낸 파라미터를 map방식으로 변환해줌.
        parameterMap = 
                new HashMap<String, String[]>(request.getParameterMap());
    }

    //NullParameterFilter클래스의 34번째 줄에서 호출
    public void checkNull(String[] parameterNames) {
        for (int i = 0; i < parameterNames.length; i++) {
            if (!parameterMap.containsKey(parameterNames[i])) {
                String[] values = new String[] { parameterNames[i] };
                parameterMap.put(parameterNames[i], values);
            }
        }
    }

    //18_01_filter03.jsp에서 호출
    @Override
    public String getParameter(String name) {
        String[] values = getParameterValues(name);
        if (values != null && values.length > 0)
            return values[0];
        return null;
    }

    
    @Override
    public Map<String, String[]> getParameterMap() {
        return parameterMap;
    }

    @Override
    public String[] getParameterValues(String name) {
        return (String[]) parameterMap.get(name);
    }

}
