/* 
 * Javascript to manage the JTable
 */

$(document).ready(function() {
	// setup the jtable that will display the results
	$('#PregnancyCategoryTableContainer').jtable({
		title : 'Pregnancy Category',
		selecting : true, // Enable selecting
		paging : true, // Enable paging
		pageSize : 10, // Set page size (default: 10)
		sorting : true, // Enable sorting
		defaultSorting : 'PregnancyCategoryCode DESC', // Set default sorting
		actions : {
			listAction : '/DrugIndex/admin/datatable/getAllPregnancyCategoryTableContainer',
			createAction : '/DrugIndex/admin/datatable/addPregnancyCategoryTableContainer',
			updateAction : '/DrugIndex/admin/datatable/updatePregnancyCategoryTableContainer',
			deleteAction : '/DrugIndex/admin/datatable/deletePregnancyCategoryTableContainer'
		},
		fields : {
			PregcategoryId : {
				title : 'ID',
				key : true,
				list : true,
				create : false,
				edit : false
			},
			PregnancyCode: {
				title : 'Category Code',
				width : '10%'
			},
			PregnancyCategory : {
				title : 'Pregnancy Category',
				width : '10%'
			}
			,
			PregnancyCategoryDescription : {
				title : 'Pregnancy Category Description',
				type : 'textarea',
				width : '40%'
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
	$('#PregnancyCategoryTableContainer').jtable('load');

});
