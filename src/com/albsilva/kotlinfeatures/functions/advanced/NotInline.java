//package com.albsilva.kotlinfeatures.functions.advanced;
//
//import kotlin.Metadata;
//import kotlin.jvm.functions.Function0;
//import kotlin.jvm.internal.Intrinsics;
//import org.jetbrains.annotations.NotNull;
//
//@Metadata(
//        mv = {1, 1, 15},
//        bv = {1, 0, 3},
//        k = 2,
//        d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0019\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005\u001a\u0014\u0010\u0006\u001a\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b¨\u0006\t"},
//        d2 = {"main", "", "args", "", "", "([Ljava/lang/String;)V", "operator", "op", "Lkotlin/Function0;", "KotlinFeatures"}
//)
//public final class InlineFunctionsKt {
//    public static final void operator(@NotNull Function0 op) {
//        Intrinsics.checkParameterIsNotNull(op, "op");
//        String var1 = "Before Op!";
//        boolean var2 = false;
//        System.out.println(var1);
//        op.invoke();
//        var1 = "After Op!";
//        var2 = false;
//        System.out.println(var1);
//    }
//
//    public static final void main(@NotNull String[] args) {
//        Intrinsics.checkParameterIsNotNull(args, "args");
//        operator((Function0)null.INSTANCE);
//    }
//}
