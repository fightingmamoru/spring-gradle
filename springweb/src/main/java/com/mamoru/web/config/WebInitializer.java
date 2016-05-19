package com.mamoru.web.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// web.xml 파일의 역할
public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
{
	// Root Context 클래스 설정 (xml 파일 위치 -> class 파일로 대체)
	// Root Context 는 미사용 이므로 null 리턴
	@Override
	protected Class<?>[] getRootConfigClasses()
	{
		return null;
	}

	// servlet 설정 (xml 파일 위치 -> class 파일로 대체)
	@Override
	protected Class<?>[] getServletConfigClasses()
	{
		return new Class<?>[] { ServletCommonConfig.class };
	}

	// servlet-mapping 설정
	@Override
	protected String[] getServletMappings()
	{
		return new String[] { "/" };
	}
}
