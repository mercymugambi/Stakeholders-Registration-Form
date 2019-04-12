/* 
 * Javascript to manage the JTable
 */

$(document).ready(function() {
	// setup the jtable that will display the results
	$('#DrugStrengthTableContainer').jtable({
		title : 'Drug  Formulation',
		selecting : true, // Enable selecting
		paging : true, // Enable paging
		pageSize : 10, // Set page size (default: 10)
		sorting : true, // Enable sorting
		defaultSorting : 'DrugStrengthCode DESC', // Set default sorting
		actions : {
			listAction : '/DrugIndex/admin/datatable/getAllDrugStrengthTableContainer',
			createAction : '/DrugIndex/admin/datatable/addDrugStrengthTableContainer',
			updateAction : '/DrugIndex/admin/datatable/updateDrugStrengthTableContainer',
			deleteAction : '/DrugIndex/admin/datatable/deleteDrugStrengthTableContainer'
		},
		fields : {
			DrugStrengthId : {
				title : 'ID',
				key : true,
				list : true,
				create : false,
				edit : false
			},
			DrugStrengthCode : {
				title : 'Drug Strength Code',
				width : '10%'
			},
			DrugStrength : {
				title : 'Drug Strength',
				width : '20%'
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
	$('#DrugStrengthTableContainer').jtable('load');

});
