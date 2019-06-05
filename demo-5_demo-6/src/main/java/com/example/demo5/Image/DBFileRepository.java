package com.example.demo5.Image;
import com.example.demo5.Image.DBFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface DBFileRepository extends JpaRepository<DBFile, String> {

}