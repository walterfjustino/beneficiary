package com.management.beneficiary.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ConcurrentTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

@Configuration
public class VirtualThreadConfig {
  @Bean
  public Executor virtualThreadExecutor() {
    return Executors.newVirtualThreadPerTaskExecutor();
  }
  @Bean
  public TaskExecutor applicationTaskExecutor() {
    return new ConcurrentTaskExecutor(Executors.newVirtualThreadPerTaskExecutor());
  }
}