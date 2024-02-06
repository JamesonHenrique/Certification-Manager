package project.certification.modules.students.entity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.certification.modules.students.entity.CertificationStudent;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "students")
@Builder
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(unique = true, nullable = false)
    private String email;

    // OneToOne
    // OneToMany
    // ManyToOne
    // ManyToMany

    @OneToMany(mappedBy = "studentEntity")
    @JsonBackReference
    private List<CertificationStudent> certificationStudentEntity;

    @CreationTimestamp
    private LocalDateTime createdAt;

}