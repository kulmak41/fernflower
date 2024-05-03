package records;

import java.lang.annotation.*;

@interface M {}

@Target(ElementType.TYPE_USE)
@interface TA {}

public record TestRecordSyntheticMethods(Integer a, Double b, Boolean c) {
  public TestRecordSyntheticMethods(String a, String b, String c) {
    this(Integer.parseInt(a), Double.parseDouble(b), Boolean.parseBoolean(c));
  }
  public TestRecordSyntheticMethods(Integer x) {
    this(x, 2.0 * x, false);
  }

  @M
  public Integer a() {
    return this.a;
  }

  public @TA Boolean c() {
    return this.c;
  }
}