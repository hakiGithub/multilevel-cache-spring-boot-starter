package com.pig4cloud.plugin.cache.metrics;

import com.pig4cloud.plugin.cache.support.RedisCaffeineCache;
import io.micrometer.core.instrument.Tag;
import io.micrometer.core.instrument.binder.MeterBinder;
import io.micrometer.core.instrument.binder.cache.CaffeineCacheMetrics;
import org.springframework.boot.actuate.metrics.cache.CacheMeterBinderProvider;

/**
 * @description
 * @author: 黄坚
 * @dateTime: 2020-09-30 14:53
 **/
public class RedisCaffeineCacheMeterBinderProvider implements CacheMeterBinderProvider<RedisCaffeineCache> {
    @Override
    public MeterBinder getMeterBinder(RedisCaffeineCache cache, Iterable<Tag> tags) {
        return new CaffeineCacheMetrics(cache.getCache(), cache.getName(), tags);
    }
}
