package edu.sjsu.openstack.dao;

import java.util.List;

import edu.sjsu.openstack.model.Project;

public interface ProjectDao {
	Project getProjectByName(String projectName);

	void insertRecord(Project createProject);

	List<Project> getProjects();

	Project getProjectById(String projectId);
}
