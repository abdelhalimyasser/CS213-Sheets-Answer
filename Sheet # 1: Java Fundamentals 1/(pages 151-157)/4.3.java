import java.util.*;


public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double RADIUS = 6371.01;

		// latitudes and longitudes in degrees
		double atlantaLat = Math.toRadians(33.7489954);
		double atlantaLon = Math.toRadians(-84.3879824);

		double orlandoLat = Math.toRadians(28.5383355);
		double orlandoLon = Math.toRadians(-81.3792365);

		double savannahLat = Math.toRadians(32.0835407);
		double savannahLon = Math.toRadians(-81.0998342);

		double charlotteLat = Math.toRadians(35.2270869);
		double charlotteLon = Math.toRadians(-80.8431267);

		// distances between cities
		double dAtlantaOrlando = RADIUS * Math.acos(Math.sin(atlantaLat) * Math.sin(orlandoLat) + Math.cos(atlantaLat) * Math.cos(orlandoLat) * Math.cos(atlantaLon - orlandoLon));

		double dOrlandoSavannah = RADIUS * Math.acos(Math.sin(orlandoLat) * Math.sin(savannahLat) + Math.cos(orlandoLat) * Math.cos(savannahLat) * Math.cos(orlandoLon - savannahLon));

		double dSavannahAtlanta = RADIUS * Math.acos(Math.sin(savannahLat) * Math.sin(atlantaLat) + Math.cos(savannahLat) * Math.cos(atlantaLat) * Math.cos(savannahLon - atlantaLon));

		double dSavannahCharlotte = RADIUS * Math.acos(Math.sin(savannahLat) * Math.sin(charlotteLat)+ Math.cos(savannahLat) * Math.cos(charlotteLat) * Math.cos(savannahLon - charlotteLon));

		double dCharlotteAtlanta = RADIUS * Math.acos(Math.sin(charlotteLat) * Math.sin(atlantaLat) + Math.cos(charlotteLat) * Math.cos(atlantaLat) * Math.cos(charlotteLon - atlantaLon));

		double s1 = (dAtlantaOrlando + dOrlandoSavannah + dSavannahAtlanta) / 2;
		double area1 = Math.sqrt(s1 * (s1 - dAtlantaOrlando) * (s1 - dOrlandoSavannah) * (s1 - dSavannahAtlanta));

		double s2 = (dSavannahCharlotte + dCharlotteAtlanta + dSavannahAtlanta) / 2;
		double area2 = Math.sqrt(s2 * (s2 - dSavannahCharlotte) * (s2 - dCharlotteAtlanta) * (s2 - dSavannahAtlanta));

		double totalArea = area1 + area2;

		System.out.println("Estimated area enclosed by the four cities: " + totalArea + " kmB2\n");
	}
}
