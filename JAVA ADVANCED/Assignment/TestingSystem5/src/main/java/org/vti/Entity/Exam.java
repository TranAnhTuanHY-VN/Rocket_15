package org.vti.Entity;

import org.hibernate.annotations.CreationTimestamp;
import org.vti.Repository.ExamRepository;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Exam", catalog = "TestingSystem5")
public class Exam implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "ExamID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short id;

	@Column(name = "`Code`", length = 10, nullable = false)
//	@GeneratedValue(generator = "exam-code-generator")
//	@GenericGenerator(name = "exam-code-generator", strategy = "com.vti.entity.generator.ExamCodeGenerator")
//	@Id
	private String code;

//	@Column(name = "`Code2`", length = 10)
//	private String code2;

	@Column(name = "Title", length = 50, nullable = false)
	private String title;

	@Column(name = "Duration", nullable = false, columnDefinition = "tinyint default 45")
	private short duration;

	@Column(name = "CreateDate")
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date createDate;

	@PrePersist
	public void beforeSaveToDatabase() {

		if (code == null) {
			ExamRepository repository = new ExamRepository();

			String prefix;

			if (duration >= 180) {
				prefix = "L";
			} else if (duration >= 90) {
				prefix = "M";
			} else {
				prefix = "S";
			}

			int count = repository.getCountOfExamCode(duration);

			code = prefix + "-" + (count + 1);
		}
	}

	public Exam() {
	}

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}

//	public String getCode1() {
//		return code1;
//	}
//
//	public void setCode1(String code1) {
//		this.code1 = code1;
//	}
//
//	public String getCode2() {
//		return code2;
//	}
//
//	public void setCode2(String code2) {
//		this.code2 = code2;
//	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public short getDuration() {
		return duration;
	}

	public void setDuration(short duration) {
		this.duration = duration;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Exam [" + "code=" + code + ", title=" + title + ", duration=" + duration
				+ ", createDate=" + createDate + "]";
	}

}
