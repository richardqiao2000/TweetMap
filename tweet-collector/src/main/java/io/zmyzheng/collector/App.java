package io.zmyzheng.collector;

import lombok.extern.slf4j.Slf4j;


import java.io.*;

import java.util.Properties;

/**
 * @Author: Mingyang Zheng
 * @Date: 2020-02-09 15:21
 */
@Slf4j
public class App {

    public static void main(String[] args) throws IOException {
//        InputStream in = new FileInputStream(new File("tweet-collector/src/main/resources/application.properties"));
//
//        Properties properties = new Properties();
//        properties.load(in);
//
//
//        log.info("Using the following configuration: {}", properties);

//        TweetCollector collector = new TweetCollector(
//                        properties.get("twitter.apiKey").toString(),
//                        properties.get("twitter.apiSecret").toString(),
//                        properties.get("twitter.token").toString(),
//                        properties.get("twitter.secret").toString(),
//                        properties.get("kafka.brokerList").toString(),
//                        properties.get("kafka.topic").toString()
//        );
        TweetCollector collector = new TweetCollector(
                "2UyRGQPzDW7pOA3P2R7FDUgPy1",
                "pCx8t4pEh6RHoMQChn9SpymIUCoJTrD3KDDQNgBDwEgh4jxUI41",
                "827004953310949377-qlvGf7jrJmtIvJd77XllpzDwyiOVbst1",
                "IaJvnMHYD0JVPIYgyRCIPCyFOTMEYCcrpvsSnlNtT4FQm1",
                "34.218.59.198:9092",
                "tweets"
        );

        collector.run();

    }
}
