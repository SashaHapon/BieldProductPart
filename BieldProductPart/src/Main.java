import com.assemblyLine.AutomotiveEngineer;
import com.assemblyLine.CarBuilder;
import com.assemblyLine.SportsCarBuilder;
import com.assemblyLine.Car;
import com.line.Tank;
import com.line.assemblyline.CAssemblyLine;

public class Main {
    public static void main(String[] args) {
        Tank panther = new Tank();
        CAssemblyLine line = new CAssemblyLine();
        panther = line.assembleProduct();
        System.out.println(panther.getBody()+ panther.getTower() + panther.getGun());
    }
}