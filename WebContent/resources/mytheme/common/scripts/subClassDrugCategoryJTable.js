/* 
 * Javascript to manage the JTable
 */

$(document).ready(function() {
	// setup the jtable that will display the results
	$('#SubClassDrugCategoryTableContainer').jtable({
		title : 'Subclass Drug Category ',
		selecting : true, // Enable selecting
		paging : true, // Enable paging
		pageSize : 10, // Set page size (default: 10)
		sorting : true, // Enable sorting
		defaultSorting : 'SubClassDrugCategoryCode DESC', // Set default sorting
		actions : {
			listAction : '/DrugIndex/admin/datatable/getAllSubClassDrugCategoryTableContainer',
			createAction : '/DrugIndex/admin/datatable/addSubClassDrugCategoryTableContainer',
			updateAction : '/DrugIndex/admin/datatable/updateSubClassDrugCategoryTableContainer',
			deleteAction : '/DrugIndex/admin/datatable/deleteSubClassDrugCategoryTableContainer'
		},
		fields : {
			SubClassDrugCategoryId : {
				title : 'ID',
				key : true,
				list : true,
				create : false,
				edit : false
			},
			SubClassDrugCategoryCode : {
				title : 'Subclass Drug Category Code',
				width : '10%'
			},
			SubClassDrugCategory : {
				title : 'SubClass Drug Category',
				type : 'textarea',
				width : '20%'
			}
			,
			SubClassGenIntroPharcology : {
				title : 'SubClass Gen Intro Pharcology',
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
	$('#SubClassDrugCategoryTableContainer').jtable('load');

});
