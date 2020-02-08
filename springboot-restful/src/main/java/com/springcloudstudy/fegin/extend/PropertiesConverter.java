package com.springcloudstudy.fegin.extend;

import com.springcloudstudy.fegin.rest.Person;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Properties;

public class PropertiesConverter extends AbstractHttpMessageConverter<Person> {

    public PropertiesConverter() {
        super(MediaType.valueOf("application/properties+person"));
        setDefaultCharset(Charset.forName("UTF-8"));
    }

    @Override
    protected boolean supports(Class<?> clazz) {
        //处理响应输出数据时：支持的类型
        return clazz.isAssignableFrom(Person.class);
    }

    @Override
    protected Person readInternal(Class<? extends Person> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        InputStream in = inputMessage.getBody();

        Properties properties = new Properties();

        properties.load(new InputStreamReader(in,getDefaultCharset()));

        String id = properties.getProperty("penson.id");
        String name = properties.getProperty("penson.name");
        return new Person().setId("id").setName("name");
    }

    @Override
    protected void writeInternal(Person person, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {

        Properties properties = new Properties();


        OutputStream outputStream = outputMessage.getBody();

        properties.setProperty("person.id",person.getId());
        properties.setProperty("person.name",person.getName());

        OutputStreamWriter writer = new OutputStreamWriter(outputStream,getDefaultCharset());

        properties.store(writer,"write-by-my");


    }
}
