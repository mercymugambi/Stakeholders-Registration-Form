/* 
 * Javascript to manage the JTable
 */

$(document).ready(function() {
	// setup the jtable that will display the results
	$('#DrugDieseaseTableContainer').jtable({
		title : 'Drug Disease Correlation',
		selecting : true, // Enable selecting
		paging : true, // Enable paging
		pageSize : 10, // Set page size (default: 10)
		sorting : true, // Enable sorting
		defaultSorting : 'DieseaseCode DESC', // Set default sorting
		actions : {
			listAction : '/DrugIndex/admin/datatable/getAllDrugDieseaseTableContainer',
			createAction : '/DrugIndex/admin/datatable/addDrugDieseaseTableContainer',
			updateAction : '/DrugIndex/admin/datatable/updateDrugDieseaseTableContainer',
			deleteAction : '/DrugIndex/admin/datatable/deleteDrugDieseaseTableContainer'
		},
		fields : {
			DrugDieseaseId : {
				title : 'ID',
				key : true,
				list : true,
				create : false,
				edit : false
			},
			DieseaseCode : {
				title : 'Disease Code',
				width : '10%'
			},
			DieseaseName : {
				title : 'Diesease Name',
				width : '20%'
			},
			ManagementOverview : {
				title : 'Management Overview',
				 type : 'textarea',
				width : '40%'
			},
			Description : {
				title : 'Description',
				 type : 'textarea',
				width : '30%'
			}

		}
	/*
	 * //Register to selectionChanged event to hanlde events recordAdded:
	 * function(event, data){ //after record insertion, reload the records
	 * $('#ExpenseTableContainer').jtable('load'); }, recordUpdated:
	 * function(event, data){ //after record updation, reload the records
	 * $('#ExpenseTableContainer').jtable('load'); }
	 */
	});
	$('#DrugDieseaseTableContainer').jtable('load');

});
