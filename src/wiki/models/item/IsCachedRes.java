// automatically generated by the FlatBuffers compiler, do not modify

package wiki.models.item;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class IsCachedRes extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static IsCachedRes getRootAsIsCachedRes(ByteBuffer _bb) { return getRootAsIsCachedRes(_bb, new IsCachedRes()); }
  public static IsCachedRes getRootAsIsCachedRes(ByteBuffer _bb, IsCachedRes obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public IsCachedRes __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public boolean cached() { int o = __offset(4); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }

  public static int createIsCachedRes(FlatBufferBuilder builder,
      boolean cached) {
    builder.startTable(1);
    IsCachedRes.addCached(builder, cached);
    return IsCachedRes.endIsCachedRes(builder);
  }

  public static void startIsCachedRes(FlatBufferBuilder builder) { builder.startTable(1); }
  public static void addCached(FlatBufferBuilder builder, boolean cached) { builder.addBoolean(0, cached, false); }
  public static int endIsCachedRes(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public IsCachedRes get(int j) { return get(new IsCachedRes(), j); }
    public IsCachedRes get(IsCachedRes obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

