package io.vertx.httpproxy.cache;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

/**
 * Converter and mapper for {@link io.vertx.httpproxy.cache.CacheOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.httpproxy.cache.CacheOptions} original class using Vert.x codegen.
 */
public class CacheOptionsConverter {


  private static final Base64.Decoder BASE64_DECODER = JsonUtil.BASE64_DECODER;
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

  public static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, CacheOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "maxSize":
          if (member.getValue() instanceof Number) {
            obj.setMaxSize(((Number)member.getValue()).intValue());
          }
          break;
      }
    }
  }

  public static void toJson(CacheOptions obj, JsonObject json) {
    toJson(obj, json.getMap());
  }

  public static void toJson(CacheOptions obj, java.util.Map<String, Object> json) {
    json.put("maxSize", obj.getMaxSize());
  }
}
