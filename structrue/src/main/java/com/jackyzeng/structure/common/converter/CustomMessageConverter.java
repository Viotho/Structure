package com.jackyzeng.structure.common.converter;

import com.jackyzeng.structure.common.model.ConverterTarget;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class CustomMessageConverter implements HttpMessageConverter<ConverterTarget> {

    @Override
    public boolean canRead(Class<?> clazz, MediaType mediaType) {
        return false;
    }

    @Override
    public boolean canWrite(Class<?> clazz, MediaType mediaType) {
        return clazz.isAssignableFrom(ConverterTarget.class);
    }

    @Override
    public List<MediaType> getSupportedMediaTypes() {
        return MediaType.parseMediaTypes("application/x-type");
    }

    @Override
    public ConverterTarget read(Class<? extends ConverterTarget> aClass, HttpInputMessage httpInputMessage) throws IOException, HttpMessageNotReadableException {
        return null;
    }

    @Override
    public void write(ConverterTarget converterTarget, MediaType mediaType, HttpOutputMessage httpOutputMessage) throws IOException, HttpMessageNotWritableException {
        String output = converterTarget.getField1() + " : " + converterTarget.getField2();
        httpOutputMessage.getBody().write(output.getBytes(StandardCharsets.UTF_8));
    }
}
