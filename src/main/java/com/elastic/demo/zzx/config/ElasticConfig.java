//package com.elastic.demo.zzx.config;
//
//
//import org.apache.http.HttpHost;
//import org.apache.http.auth.AuthScope;
//import org.apache.http.auth.UsernamePasswordCredentials;
//import org.apache.http.client.CredentialsProvider;
//import org.apache.http.impl.client.BasicCredentialsProvider;
//import org.apache.http.impl.nio.client.HttpAsyncClientBuilder;
//import org.elasticsearch.action.admin.indices.stats.TransportIndicesStatsAction;
//import org.elasticsearch.client.RestClient;
//import org.elasticsearch.client.RestClientBuilder;
//import org.elasticsearch.client.RestHighLevelClient;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//
//@Configuration
//public class ElasticConfig {
//
//    @Bean
//    public RestHighLevelClient client(){
//        /*用户认证对象*/
//        final CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
//        /*设置账号密码*/
//        credentialsProvider.setCredentials(AuthScope.ANY,new UsernamePasswordCredentials("elastic", "elastic"));
//        /*创建rest client对象*/
//        RestClientBuilder builder = RestClient.builder(new HttpHost("192.168.183.129",9200))
//                .setHttpClientConfigCallback(new RestClientBuilder.HttpClientConfigCallback() {
//                    @Override
//                    public HttpAsyncClientBuilder customizeHttpClient(HttpAsyncClientBuilder httpAsyncClientBuilder) {
//                        return httpAsyncClientBuilder.setDefaultCredentialsProvider(credentialsProvider);
//                    }
//                });
//        RestHighLevelClient client = new RestHighLevelClient(builder);
//        return client;
//    }
//
//}
