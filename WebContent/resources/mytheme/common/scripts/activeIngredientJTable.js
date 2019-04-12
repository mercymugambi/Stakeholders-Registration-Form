/* 
 * Javascript to manage the JTable
 */

$(document).ready(function() {              
    //setup the jtable that will display the results
    $('#ActiveIngredientTableContainer').jtable({
        title: 'Table of ActiveIngredients',
        selecting: true, //Enable selecting 
        paging: true, //Enable paging
        pageSize: 10, //Set page size (default: 10)
        sorting: true, //Enable sorting
        defaultSorting : 'ActiveIngredientCode ASC',
        actions: {
            listAction: 'datatable/getAllActiveIngredients',
            createAction: 'datatable/addActiveIngredient',
            updateAction: 'datatable/updateActiveIngredient',
            deleteAction: 'datatable/deleteActiveIngredient'
        },
        fields: {
        	ActiveIngredientId: {
                title: 'ID',
                key: true,
                list: true,
                create: false,
                edit: false
            },
          
            ActiveIngredientCode: {
                title: 'Code',
                width: '10%'
            },
            ActiveIngredientName: {
                title: 'Name',
                type : 'textarea',
                width: '10%'
            },
            
            ActiveIngredientIndications: {
                title: 'Ingredient Indications',
                type : 'textarea',
                width: '10%'
            },
            Dosage: {
                title: 'Dosage',
                type : 'textarea',
                width: '10%'
            },
            
            Ai_contraIndications: {
                title: 'ContraIndications',
                type : 'textarea',
                width: '10%'
            },
            
            Precautions: {
                title: 'Precautions',
                type : 'textarea',
                width: '10%'
            },
            
            SideEffects: {
                title: 'SideEffects',
                type : 'textarea',
                width: '30%'
            },
            SpecialCounselling: {
                title: 'Special Counselling',
                type : 'textarea',
                width: '20%'
            },
            SpecialInfomation: {
                title: 'SpecialInfomation',
                type : 'textarea',
                width: '20%'
            },
            Hepdis: {
                title: 'Hepdis',
                type : 'textarea',
                width: '10%'
            },
            Renaldis: {
                title: 'Renaldis',
                type : 'textarea',
                width: '15%'
            },
            Efavivenz: {
                title: 'Efavivenz',
                type : 'textarea',
                width: '15%'
            },
            PregnancyCategoryId: {
                title: 'Pregnancy Category',
                options: 'datatable/pregnancyCategory'
            },            
            DrugClassCategoryId: {
                title: 'Drug Class Category',
                options: 'datatable/DrugClassCategory'
            },
            SubClassDrugCategoryId: {
                title: 'Sub Class Drug Category',
                options: 'datatable/subClassDrugCategory'
            },
            
            BreastFeedingAdvisoryId: {
                title: 'Breast Feeding Advisory',
                options: 'datatable/breastFeedingAdvisory'
            }
        }
      /*  //Register to selectionChanged event to hanlde events                                     
        recordAdded: function(event, data){
            //after record insertion, reload the records
            $('#ExpenseTableContainer').jtable('load');
        },
        recordUpdated: function(event, data){
            //after record updation, reload the records
            $('#ExpenseTableContainer').jtable('load');
        }*/
    });
    $('#ActiveIngredientTableContainer').jtable('load');              
                
});
