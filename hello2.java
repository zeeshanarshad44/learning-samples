import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

class ExampleCode {
	/*
	 * <summary>
	 * Given a user_name a user, print the whole JSON object about all the incidents the user reported.
	 * And returns an array of incident locations that the specified user reported.
	 * Note that this is simple example to GET and parse information from our API.
	 * </summary>
	 * <param name = "user_name"> The username of the specified user.</param>
	 * <returns> An array of incidents locationss that the specified user reported.</returns>
	 */
	public ArrayList <String> GetReportedIncidentsLocations (String user_name) throws Exception {
		
		// Create variable to hold the returned locations of the incidents
		ArrayList <String> incidentsLocations = new ArrayList <String> ();
		
		// Construct a URL using the user_name
		String url_string = "http://comp120team8reporter.herokuapp.com/v1/user/user_reported_incidents?username="
				+ user_name;
		URL url = new URL(url_string);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		
		// Send GET request and get the responseCode
		con.setRequestMethod("GET");
		int responseCode = con.getResponseCode();
		
		// Handle the failed case
		if (responseCode != 200) {
			// GET unsuccessful
		}
		
		// Receive and print the whole JSON object about all the incidents the user reported.
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response_buffer = new StringBuffer();
		while ((inputLine = in.readLine()) != null) {
			response_buffer.append(inputLine);
		}
		in.close();
		String response_string = response_buffer.toString();
		System.out.println(response_string);
		
		// Parse the JSON object
		JSONObject response_json = new JSONObject(response_string);
		String status = response_json.get("status").toString();
		
		if (status.equals("400") ) {
			// user cannot be found
		}
		else if (status.equals("200")) {
			// user is found
			JSONArray incidents = response_json.getJSONArray("incidents");
			for(int i = 0; i < incidents.length(); i++) {
				String location = incidents.getJSONObject(i).get("location").toString();
				incidentsLocations.add(location);
			}
		}
		else {
			// error
		}
		return incidentsLocations;
	}
}
