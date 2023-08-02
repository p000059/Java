package Persistence.DAO;

import java.util.ArrayList;
import java.util.List;
import Persistence.Model.Class.*;
import Persistence.Model.Interface.*;
import Persistence.Util.Utill;

public class DAOPersonEmail extends Utill implements IDAO<PersonEmail> {

	@Override
	public void create(PersonEmail object) {

		String sql = "INSERT INTO person_email (person_id, email_id) VALUES (?,?)";

		try {

			Utill.openConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, object.getPerson_id());
			preparedStatement.setInt(2, object.getEmail_id());
			preparedStatement.execute();

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {

				Utill.closeConnection();

			} catch (Exception ex) {

				ex.printStackTrace();
			}
		}
	}

	@Override
	public int findMaxId() {

		return 0;
	}

	@Override
	public List<PersonEmail> readAll() {

		List<PersonEmail> lstPersonEmail = new ArrayList<>();
		PersonEmail personEmail = null;
		String sql = "SELECT * FROM person_email";

		try {

			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				personEmail = new PersonEmail();
				personEmail.setEmail_id(resultSet.getInt("email_id"));
				personEmail.setPerson_id(resultSet.getInt("person_id"));
				lstPersonEmail.add(personEmail);

			}

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {

				Utill.closeConnection();

			} catch (Exception e) {

				e.printStackTrace();
			}

		}

		return lstPersonEmail;
	}

	@Override
	public PersonEmail read(int object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(PersonEmail object) {
		// TODO Auto-generated method stub
	}

	@Override
	public void delete(PersonEmail object) {
		// TODO Auto-generated method stub
	}
}
