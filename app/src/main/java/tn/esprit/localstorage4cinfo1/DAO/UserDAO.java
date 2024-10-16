package tn.esprit.localstorage4cinfo1.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import tn.esprit.localstorage4cinfo1.entities.User;

@Dao
public interface UserDAO {
    @Insert
    void addUSer(User u);
    @Update
    void updateUSer(User u);
    @Delete
    void deleteUSer(User u);
    @Query("SELECT * FROM user")
    List<User> getAll();
    @Query("SELECT * FROM user where id = :id")
    User getOne(int id);


}
