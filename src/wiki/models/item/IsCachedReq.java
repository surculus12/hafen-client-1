// automatically generated by the FlatBuffers compiler, do not modify

package wiki.models.item;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class IsCachedReq extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static IsCachedReq getRootAsIsCachedReq(ByteBuffer _bb) { return getRootAsIsCachedReq(_bb, new IsCachedReq()); }
  public static IsCachedReq getRootAsIsCachedReq(ByteBuffer _bb, IsCachedReq obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public IsCachedReq __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String gobid() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer gobidAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer gobidInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }

  public static int createIsCachedReq(FlatBufferBuilder builder,
      int gobidOffset) {
    builder.startTable(1);
    IsCachedReq.addGobid(builder, gobidOffset);
    return IsCachedReq.endIsCachedReq(builder);
  }

  public static void startIsCachedReq(FlatBufferBuilder builder) { builder.startTable(1); }
  public static void addGobid(FlatBufferBuilder builder, int gobidOffset) { builder.addOffset(0, gobidOffset, 0); }
  public static int endIsCachedReq(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public IsCachedReq get(int j) { return get(new IsCachedReq(), j); }
    public IsCachedReq get(IsCachedReq obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}
