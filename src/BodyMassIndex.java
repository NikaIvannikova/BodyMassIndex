public class BodyMassIndex {
    public float calculate(float weight, float height) {

        float preimt = height * 2;
    float imt = weight / preimt * 100;

    return imt;
    }
}
